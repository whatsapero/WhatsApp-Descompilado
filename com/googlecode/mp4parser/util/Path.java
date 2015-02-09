package com.googlecode.mp4parser.util;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Path {
    static final /* synthetic */ boolean $assertionsDisabled;
    static Pattern component;

    static {
        $assertionsDisabled = !Path.class.desiredAssertionStatus();
        component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    private Path() {
    }

    public static String createPath(Box box) {
        return createPath(box, "");
    }

    private static String createPath(Box box, String path) {
        Container parent = box.getParent();
        int index = 0;
        for (Box sibling : parent.getBoxes()) {
            if (sibling.getType().equals(box.getType())) {
                if (sibling == box) {
                    break;
                }
                index++;
            }
        }
        path = new StringBuilder(String.valueOf(String.format("/%s[%d]", new Object[]{box.getType(), Integer.valueOf(index)}))).append(path).toString();
        return parent instanceof Box ? createPath((Box) parent, path) : path;
    }

    public static Box getPath(Box box, String path) {
        List<? extends Box> all = getPaths(box, path, true);
        return all.isEmpty() ? null : (Box) all.get(0);
    }

    public static Box getPath(Container container, String path) {
        List<? extends Box> all = getPaths(container, path, true);
        return all.isEmpty() ? null : (Box) all.get(0);
    }

    public static Box getPath(AbstractContainerBox containerBox, String path) {
        List<? extends Box> all = getPaths(containerBox, path, true);
        return all.isEmpty() ? null : (Box) all.get(0);
    }

    public static List<Box> getPaths(AbstractContainerBox containerBox, String path) {
        return getPaths(containerBox, path, false);
    }

    public static List<Box> getPaths(Box box, String path) {
        return getPaths(box, path, false);
    }

    public static List<Box> getPaths(Container container, String path) {
        return getPaths(container, path, false);
    }

    private static List<Box> getPaths(AbstractContainerBox container, String path, boolean singleResult) {
        return getPaths((Object) container, path, singleResult);
    }

    private static List<Box> getPaths(Container container, String path, boolean singleResult) {
        return getPaths((Object) container, path, singleResult);
    }

    private static List<Box> getPaths(Box box, String path, boolean singleResult) {
        return getPaths((Object) box, path, singleResult);
    }

    private static List<Box> getPaths(Object thing, String path, boolean singleResult) {
        Object obj;
        if (path.startsWith("/")) {
            path = path.substring(1);
            while (thing instanceof Box) {
                thing = ((Box) thing).getParent();
            }
            obj = thing;
        } else {
            obj = thing;
        }
        if (path.length() != 0) {
            String later;
            String now;
            if (path.contains("/")) {
                later = path.substring(path.indexOf(47) + 1);
                now = path.substring(0, path.indexOf(47));
            } else {
                now = path;
                later = "";
            }
            Matcher m = component.matcher(now);
            if (m.matches()) {
                String type = m.group(1);
                if ("..".equals(type)) {
                    return obj instanceof Box ? getPaths(((Box) obj).getParent(), later, singleResult) : Collections.emptyList();
                } else {
                    if (!(obj instanceof Container)) {
                        return Collections.emptyList();
                    }
                    int index = -1;
                    if (m.group(2) != null) {
                        index = Integer.parseInt(m.group(3));
                    }
                    List<Box> children = new LinkedList();
                    int currentIndex = 0;
                    for (Box box1 : ((Container) obj).getBoxes()) {
                        if (box1.getType().matches(type)) {
                            if (index == -1 || index == currentIndex) {
                                children.addAll(getPaths(box1, later, singleResult));
                            }
                            currentIndex++;
                        }
                        if ((singleResult || index >= 0) && !children.isEmpty()) {
                            return children;
                        }
                    }
                    return children;
                }
            }
            throw new RuntimeException(new StringBuilder(String.valueOf(now)).append(" is invalid path.").toString());
        } else if (obj instanceof Box) {
            return Collections.singletonList((Box) obj);
        } else {
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
    }

    public static boolean isContained(Box box, String path) {
        if ($assertionsDisabled || path.startsWith("/")) {
            return getPaths(box, path).contains(box);
        }
        throw new AssertionError("Absolute path required");
    }
}

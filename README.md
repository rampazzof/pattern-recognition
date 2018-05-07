# DESCRIPTION

Computer vision involves analyzing patterns in visual images and reconstructing the real world objects that
produced them. The process in often broken up into two phases: feature detection and pattern recognition.
Feature detection involves selecting important features of the image; pattern recognition involves
discovering patterns in the features. We will investigate a particularly clean pattern recognition problem
involving points and line segments. This kind of pattern recognition arises in many other applications, for
example statistical data analysis.

# REST API

### Add a point to the space

```POST /point```

### Get all points in the space

```GET /lines/{n}```

### Get all line segments passing through at least N points

```GET /space```

### Remove all points from the space

```DELETE /space```

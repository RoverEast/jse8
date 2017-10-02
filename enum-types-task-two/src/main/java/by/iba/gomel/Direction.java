package by.iba.gomel;

/**
 * enum Direction
 */
public enum Direction {
    UP {
        @Override
        public String move(final Point point) {
            point.setY(point.getY() + 1);
            return point.toString();
        }
    },

    DOWN {
        @Override
        public String move(final Point point) {
            point.setY(point.getY() - 1);
            return point.toString();
        }
    },
    RIGHT {
        @Override
        public String move(final Point point) {
            point.setX(point.getX() + 1);
            return point.toString();
        }
    },
    LEFT {
        @Override
        public String move(final Point point) {
            point.setX(point.getX() - 1);
            return point.toString();
        }
    };

    /**
     * move meth
     *
     * @param point
     *            move point
     * @return point position
     */
    public abstract String move(Point point);
}

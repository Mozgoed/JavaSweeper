package sweeper;

class Flag {
    private Matrix flagMap;

    void start() {
        flagMap = new Matrix(Box.CLOSED);
    }

    Box get(Coord coord) {
        return flagMap.get(coord);
    }

    void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.OPENED);
    }

    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
    }

    void setFlagedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
    }

    void toggleFlagedToBox(Coord coord) {
        switch (flagMap.get(coord)) {
            case FLAGED:
                setClosedToBox(coord);
                break;
            case CLOSED:
                setFlagedToBox(coord);
                break;
        }
    }
}

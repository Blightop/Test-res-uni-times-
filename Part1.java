public class Part1 {
    public enum UggRockSize {
        BIGUN,
        QUITE_BIGUN,
        NOT_SO_BIGUN;
    }
    public enum UggRockType {
        SPECKILY,
        OUCHY_BLACK,
        FLOATY,
        HOT_HOT_HOT;
    }


    // Constructs a new UggRock object with the given size and type.
        static class UggRock { 
        
        private UggRockSize size;
        private UggRockType type;    

        public UggRock(UggRockSize size, UggRockType type){
            this.size = size;
            this.type = type;
        }

        public UggRockSize getSize() {
            return size;
        }

        public UggRockType getType() {
            return type;
        }

        @Override
        public String toString() {
            return size.toString() + ", " + type.toString();
        }

        
    }
    public static void main(String[] args) {
            // Testing UggRock creation and values
        UggRock rock = new UggRock(UggRockSize.BIGUN, UggRockType.FLOATY);

        UggRockSize rockSize = rock.getSize(); // BIGUN
        UggRockType rockType = rock.getType(); // FLOATY
        System.out.println("Rock Size: " + rockSize);
        System.out.println("Rock Type: " + rockType);
        System.out.println(rock.toString());
        }
}


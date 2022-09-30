public class House {
    private String adress;

    private int numberOfRooms;

    private int price;

    public House(String adress, int numberOfRooms, int price) {
        this.adress = adress;
        if (numberOfRooms > 0) {
            this.numberOfRooms = numberOfRooms;
        }
        if (price > 0) {
            this.price = price;
        }
    }

        public String getAdress () {
            return adress;
        }

        public int getNumberOfRooms () {
            return numberOfRooms;
        }

        public int getPrice () {
            return price;
        }

        public String houseWithRooms ( int numberOfRooms){
            if (this.numberOfRooms == numberOfRooms) {
                return this.adress + " " + this.price;
            }
            return null;
        }

        public void setPrice ( int price){
            if (price > 0) {
                this.price = price;
            }
        }

    }

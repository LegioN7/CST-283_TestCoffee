    public class CoffeeBeanOrder
    {
        private double weight;
        private int quality;
        static final double SHIPPING_RATE = 3.99;

        public CoffeeBeanOrder()
        {
            weight = 0;
            quality = 0;
        }

        public CoffeeBeanOrder(double w, int q)
        {
            weight = w;
            quality = q;
        }

        public void setWeight(double w)
        {
            weight = w;
        }

        public double getWeight()
        {
            return weight;
        }

        public void setQuality(int q)
        {
            quality = q;
        }

        public int getQuality()
        {
            return quality;
        }

        public double calcCost()
        {
            double cost;
            if (quality == 1)
            {
                cost = weight * 8.99;
            }
            else if (quality == 2)
            {
                cost = weight * 14.99;
            }
            else if (quality == 3)
            {
                cost = weight * 24.99;
            } else {
                cost = 0;
            }

            return cost;
        }

        public double calcShipping()
        {
            double shipping;
            shipping = weight * SHIPPING_RATE;
            return shipping;
        }

        public String toString()
        {
            String qualityType = "";

            if (quality == 1)
            {
                qualityType = "Marginal";
            }
            else if (quality == 2)
            {
                qualityType = "Good";
            }
            else if (quality == 3)
            {
                qualityType = "Best";
            } else {
                qualityType = "Invalid";
            }

            return "Weight: " + weight + " Quality: " + qualityType;
        }
    }
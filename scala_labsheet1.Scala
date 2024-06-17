def araOfDisk(r:Double):Double=math.Pi*r*r

def temperature_into_Fahrenheit(c:Double):Double=c*1.8 +32
def volume_of_a_sphere(r:Double):Double=4.0/3.0*math.Pi*r*r*r

def wholesaleBookCost(copies: Int): Double = {val coverPrice = 24.95; val discount = 0.4; val shippingCostFirst50 = 3.0; val shippingCostExtra = 0.75; val discountedPrice = coverPrice * (1 - discount); val totalBookCost = copies * discountedPrice; val shippingCost = if (copies <= 50) shippingCostFirst50; else shippingCostFirst50 + (copies - 50) * shippingCostExtra; totalBookCost + shippingCost;}

def easy_pace(distance:Double):Double=8*distance; def tempo(distance:Double):Double=7*distance;def total_run_time(d1:Double,d2:Double,d3:Double):Double=easy_pace(d1)+tempo(d2)+easy_pace(d3)
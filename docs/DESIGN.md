# Shipping Quote Calculator

## Cost Formula

Write your cost formula (math or pseudocode). It must include:
- at least one weight-based factor
- at least one size-based factor

```java 
finalCost = Math.max(baseCost, Math.pow(weight, 1.5) / (1000 * (1 / (surfaceArea / 12))))
```


Brief justification (2–4 sentences):
For the base cost, we chose 2 dollars, since for smaller packages, the cost of size and weight isn't going to impact the cost greatly. For the weight cost, we are going to be using a nonlinear equation when calculating due to the effort required increasing significantly when packages start to get around 50+ pounds. Finally, for the size cost, it nonlinearly increases by not only the weight but the surface area.


---

## Method List

For each method, keep it short. Include only:
- description (1 sentence)
- inputs (short list)
- output (what it returns)
- return type


**Method 1**: calculateTotalCost
- description: This will calculate and print the total cost of shipping.
- inputs: baseCost, weight, surfaceArea
- output: totalCost
- return type: double

**Method 2**: calculateVolume
- description: This will calculate the volume.
- inputs: length, width, height
- output: packageVolume
- return type: double

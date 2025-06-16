# Series Expansion of eˣ

This challenge approximates the value of the exponential function `e^x` using the first 10 terms of its Taylor series expansion.

---

## Mathematical Background

The exponential function `e^x` can be approximated using the Maclaurin (Taylor) series:

$`e^x \approx \sum_{n=0}^{9} \frac{x^n}{n!}`$

This approximation is typically accurate up to 4 decimal places for small-to-moderate values of `x`.

---

## Input Format

1. The first line contains an integer `n` — the number of test cases.
2. The next `n` lines each contain a float `x`.

---

## Output Format

For each input `x`, output the approximate value of `e^x` using the first 10 terms, rounded to 4 decimal places.


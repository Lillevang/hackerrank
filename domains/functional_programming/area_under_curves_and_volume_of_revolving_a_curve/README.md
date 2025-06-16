# Area and Volume Visualization of f(x)

This challenge computes:

1. The area under a polynomial function f(x)
2. The volume of the solid formed by rotating f(x) around the x-axis

The solution combines Elixir (for numeric integration) and Python (for plotting results).

---

## 📥 Problem Summary

You're given:

- A list of coefficients `[c₀, c₁, ...]`
- A matching list of powers `[p₀, p₁, ...]`
- Two bounds `L` and `R`

The function is evaluated as:

`f(x) = c₀·x^p₀ + c₁·x^p₁ + ...`

### You must compute:

- 📈 **Area**: ∫ from L to R of f(x) dx  
- 🌀 **Volume**: π · ∫ from L to R of f(x)² dx

Both integrals are approximated using the trapezoidal rule with a step size of 0.001.

---

## How to Run

### 1. Compute the values with Elixir

```bash
elixir solution.elixir
```
This prints the area and volume, and generates a file fx.csv with sampled x, f(x) data.


### 2. Generate visualizations with Python

```bash
python3 visualize.py
```

This will create:
- area.png -> filled 2D plot under f(x)
- volume.png -> 3D surface of revolution

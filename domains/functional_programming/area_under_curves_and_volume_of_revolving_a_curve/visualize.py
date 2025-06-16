import matplotlib.pyplot as plt
import pandas as pd
import numpy as np
from mpl_toolkits.mplot3d import Axes3D

# Load the CSV
df = pd.read_csv("fx.csv", names=["x", "fx"])

# --- 2D Plot: Area under the curve ---
plt.figure()
plt.plot(df["x"], df["fx"], label="f(x)", color="blue")
plt.fill_between(df["x"], df["fx"], color="blue", alpha=0.2)
plt.xlabel("x")
plt.ylabel("f(x)")
plt.title("Area under f(x)")
plt.legend()
plt.grid(True)
plt.savefig("area.png")  # 📸 Save as image
plt.close()

# --- 3D Plot: Volume of revolution ---
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')

theta = np.linspace(0, 2 * np.pi, 100)
x = df["x"].values
fx = df["fx"].values

X, T = np.meshgrid(x, theta)
F = np.tile(fx, (len(theta), 1))
Y = F * np.cos(T)
Z = F * np.sin(T)

ax.plot_surface(X, Y, Z, rstride=1, cstride=1, alpha=0.8, cmap="viridis")
ax.set_xlabel('x')
ax.set_ylabel('y')
ax.set_zlabel('z')
plt.title("Volume of revolution of f(x) around x-axis")
plt.tight_layout()
plt.savefig("volume.png")  # 📸 Save as image
plt.close()

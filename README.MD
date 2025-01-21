# 📐 Design System KMP  

**Design System KMP** is a Kotlin Multiplatform (KMP) library for unified UI styling across Android and iOS applications. It provides typography, colors, spacing, and other design system components.  

## 🔧 Features  

- 🎨 **Flexible color palette** (light and dark themes)  
- ✍ **Typography based on Compose Multiplatform**  
- 📏 **Dimension system (spacing, element sizes)**  
- 🌍 **KMP support for Android and iOS**  
- 📦 **Easy integration**  

## 📦 Installation  

Add the library to your project dependencies:  

### Gradle (Kotlin DSL)  
```kotlin
dependencies {
    implementation("io.github.yusuf0405:designsystem:<latest-version>")
}
```  

## 🚀 Usage  

### 🔹 Typography  
```kotlin
val typography = DesignSystemTheme.typography
Text("Hello, world!", style = typography.titleLarge.bold)
```  

### 🔹 Color Palette  
```kotlin
val colors = DesignSystemTheme.colors
Box(modifier = Modifier.background(colors.primary))
```  

### 🔹 Dynamic Theme Switching  
```kotlin
DesignSystemTheme(isDarkTheme = true) {
    // Your content
}
```  

## 📜 License  
This project is licensed under the MIT License.

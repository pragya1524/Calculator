# Calculator 

A modern, feature-rich calculator Android application built with Jetpack Compose.

## 📱 Overview

Calculator V2 is a sleek and functional calculator app that provides a clean user interface with smooth animations and haptic feedback. Built using modern Android development practices, it offers a responsive design that adapts to different screen sizes and orientations.

## ✨ Features

- **Basic Operations**: Addition, subtraction, multiplication, division
- **Advanced Functions**: Percentage calculations
- **User Experience**: 
  - Haptic feedback on button presses
  - Smooth button animations
  - Dynamic text sizing for better readability
  - Clean, modern Material Design 3 interface
- **Responsive Design**: Automatically adjusts to different screen sizes
- **State Management**: Built with MVVM architecture using ViewModel
- **Memory Efficient**: Proper state handling and lifecycle management

## 🛠️ Technical Details

### Architecture
- **MVVM Pattern**: Clean separation of concerns
- **Jetpack Compose**: Modern declarative UI framework
- **ViewModel**: Lifecycle-aware state management
- **State Hoisting**: Efficient state management pattern

### Key Components
- `MainActivity`: Main entry point and UI composition
- `CalculatorV2`: Main calculator UI component
- `CalculatorV2Button`: Reusable button component with animations
- `CalculatorV2ViewModel`: Business logic and state management
- `CalculatorV2State`: Data class for calculator state
- `CalculatorV2Actions`: Sealed class for user actions
- `CalculatorV2Operations`: Enum for mathematical operations

### Technologies Used
- **Kotlin**: Primary programming language
- **Jetpack Compose**: UI framework
- **Material Design 3**: Design system
- **Gradle**: Build system
- **Android SDK**: Target API level 34

## 🚀 Getting Started

### Prerequisites
- Android Studio (latest version)
- Android SDK (API level 21 or higher)
- Kotlin 1.8.0 or higher

### Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd CalculatorV2
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the CalculatorV2 folder and open it

3. **Sync and Build**
   - Wait for Gradle sync to complete
   - Build the project (Build → Make Project)

4. **Run on Device/Emulator**
   - Connect an Android device or start an emulator
   - Click the "Run" button (green play icon)

## 📱 Usage

### Basic Operations
1. **Numbers**: Tap number buttons (0-9) to input values
2. **Operations**: Use +, -, ×, ÷ for basic arithmetic
3. **Decimal**: Press "." to add decimal points
4. **Calculate**: Press "=" to see the result
5. **Clear**: Press "AC" to reset the calculator

### Advanced Features
- **Percentage**: Calculate percentages of numbers
- **Sign Change**: Toggle between positive and negative numbers
- **Delete**: Remove the last entered digit

### Display Features
- **Dynamic Sizing**: Text automatically adjusts based on content length
- **Multi-line Support**: Long calculations display on multiple lines
- **Responsive Layout**: Adapts to different screen orientations

## 🏗️ Project Structure

```
CalculatorV2/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/calculatorv2/
│   │   │   ├── MainActivity.kt              # Main activity
│   │   │   ├── CalculatorV2.kt              # Main UI component
│   │   │   ├── CalculatorV2Button.kt        # Button component
│   │   │   ├── CalculatorV2ViewModel.kt     # ViewModel
│   │   │   ├── CalculatorV2State.kt         # State data class
│   │   │   ├── CalculatorV2Actions.kt       # Action sealed class
│   │   │   └── CalculatorV2Operations.kt    # Operations enum
│   │   ├── res/
│   │   │   ├── values/
│   │   │   │   ├── strings.xml               # String resources
│   │   │   │   ├── colors.xml                # Color definitions
│   │   │   │   └── themes.xml                # App themes
│   │   │   └── drawable/                     # App icons
│   │   └── AndroidManifest.xml               # App manifest
│   └── build.gradle.kts                      # App-level build config
├── build.gradle.kts                          # Project-level build config
├── gradle.properties                         # Gradle properties
└── README.md                                 # This file
```

## 🔧 Customization

### Colors and Themes
- Modify `app/src/main/res/values/colors.xml` to change app colors
- Update `app/src/main/res/values/themes.xml` for theme changes

### Button Layout
- Adjust spacing in `CalculatorV2.kt` by modifying `buttonSpacing` and `verticalSpacing`
- Change button sizes by modifying the `aspectRatio` values

### Text Display
- Modify font sizes in the display text section of `CalculatorV2.kt`
- Adjust line heights and spacing for different text sizes

## 🐛 Troubleshooting

### Common Issues

1. **Build Errors**
   - Ensure all dependencies are synced
   - Clean and rebuild the project
   - Check Gradle version compatibility

2. **UI Issues**
   - Verify Material Design 3 dependencies
   - Check for missing imports
   - Ensure proper Compose version

3. **Runtime Crashes**
   - Check logcat for error details
   - Verify state management logic
   - Test on different API levels

### Debug Tips
- Use Android Studio's Layout Inspector for UI debugging
- Enable verbose logging in logcat
- Test on multiple device configurations

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

### How to Contribute
1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## 📞 Support

If you encounter any issues or have questions:
- Create an issue in the repository
- Check the troubleshooting section above
- Review the code comments for implementation details

## 🔮 Future Enhancements

Potential features for future versions:
- Scientific calculator functions
- History of calculations
- Custom themes and color schemes
- Landscape mode optimization
- Widget support
- Cloud sync for calculation history

---

**Built with ❤️ using Jetpack Compose and Material Design 3**

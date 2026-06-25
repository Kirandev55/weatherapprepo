# Weather App

A simple Android Weather app built with Kotlin using MVVM and Clean Architecture, Coroutines, StateFlow, Room, and Retrofit.

The app connects to OpenWeatherMap API to fetch current weather and history.

## Features

### User Authentication
* **Register and Login**: Robust validation and account registration interfaces.
* **Session Management**: Persistent user session handling using modern Jetpack Preferences DataStore.

### Weather
* **Current Weather**: Fetch current weather for the user's coordinates, resolving them to city and country.
* **Translucent UI & Styling**: Glassmorphic theme using space-indigo and electric-cyan accents.
* **Sunrise and Sunset**: Displays exact localized sunrise and sunset times.
* **Dynamic Graphics**: Weather icon changes based on conditions and time of day (including moon icons for nocturnal conditions after 6:00 PM).

### History
* **Room SQLite Cache**: Stores previously fetched weather logs in a local SQLite database using Room.
* **History Dashboard**: A dedicated history tab displaying previous search listings in descending chronological order.

### Modern Android Tools
* Kotlin, Coroutines, Flow, StateFlow
* Jetpack Compose (Material 3) and custom styled layouts
* Room Database (Local Persistence)
* Retrofit 2 and OkHttp Logging Interceptor
* Hilt Dependency Injection (DI)

### Security
* **API Key Protection**: API key is stored securely in your private local files and never tracked in version control (Git).
* **Client-Side Validations**: Strict input validations on login and registration screens.
* **Network Traffic Security**: Configured to disable cleartext traffic globally via custom network security configuration.

---

## Setup & Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/devendrachavan/weather-app.git
   ```

2. **Open the project** in Android Studio.

3. **Add OpenWeatherMap API Key**:

   > [!WARNING]
   > Do NOT include your real API key in the repository. Replace it with a placeholder or add it directly to your private local properties file to keep it safe from GitHub.

   * Get your free API key from [OpenWeatherMap](https://openweathermap.org/).
   * Add the key to `local.properties` in your project root:
     ```properties
     OPEN_WEATHER_API_KEY=your_real_api_key_here
     ```
     *(Note: The app automatically reads this API key from `BuildConfig.OPEN_WEATHER_API_KEY` at compile time).*

4. **Build and run** the app on an emulator or device.

---

## Usage

1. Open the app.
2. Register a new account on the signup screen or login with existing credentials.
3. Grant location permissions.
4. View the current weather on the first tab.
5. See previously fetched weather listings in the second tab (History).

---

## Testing

Unit tests are included for:
* `WeatherRepositoryImpl` and remote network mapping states
* `WeatherViewModel` and deterministic state transitions
* `AuthRepositoryImpl` and session management
* `AuthViewModel` state transitions
* `RegisterUseCase` and `GetWeatherUseCase` delegation

Run the unit test suite using:
```bash
.\gradlew.bat testDebugUnitTest --no-daemon --max-workers=2
```

---

## Notes
* **API Key Security**: Do not commit your real API key to your remote GitHub repository; keep it private inside your local files.
* Supports Android Minimum SDK 24 and above.
* The app uses Jetpack Compose, Clean Architecture UseCases, Hilt, Coroutines, and StateFlow to implement modern Android design and structure.

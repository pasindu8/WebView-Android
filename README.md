# Advanced WebView Android App 🚀

A powerful and modern Android WebView application built with Kotlin, featuring a dynamic user interface, smooth navigation, and optimized web rendering capabilities. This project is structured using clean coding practices and is ready for remote database configurations like MongoDB Atlas.

---

## ✨ Features

* **Dynamic Web View:** Renders modern, heavy JavaScript websites seamlessly with full DOM storage support.
* **Swipe-to-Refresh:** Users can pull down from the top to refresh the webpage instantly.
* **Horizontal Progress Bar:** A sleek visual loading indicator showing the real-time progress of the page.
* **Smart Navigation:** Customized back button behavior to navigate backward within the website's history instead of accidentally exiting the app.
* **Custom Brand Identity:** Integrated with a custom launcher icon and adaptive background branding.
* **Modern Architecture:** Utilizes RecyclerView and Adapter patterns to scale for multiple website links dynamically.

---

## 🛠️ Tech Stack & Libraries

| Component | Technology / Library Used |
| :--- | :--- |
| **Language** | Kotlin |
| **UI Design** | XML (Empty Views Activity Architecture) |
| **Image Loading** | [Glide](https://github.com/bumptech/glide) (For asynchronous web logo fetching) |
| **Networking** | Retrofit & Gson (Ready for MongoDB Data API integration) |

---

## 📁 Project Structure

The project follows a clean package structural approach under `com.example.email`:

```text
com.example.email/
├── MainActivity.kt        # Host screen displaying the website list/hub
├── WebAdapter.kt          # Handles RecyclerView population & data binding
├── Website.kt             # Data model class for website configuration
└── WebViewActivity.kt     # Handles core web rendering and advanced browser behaviors
```
## 🚀 Getting Started
Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites
<ul>
  <li>Android Studio (Jellyfish or newer recommended)</li>
  <li>Android SDK API 24+ (Android 7.0 Nougat or higher)</li>
</ul>

### Installation & Run
<ol>
<li>Clone the repository:</li>
  
```Bash
git clone https://github.com/pasindu8/WebView-Android.git
```
<li>Open the project inside Android Studio.</li>

<li>Let Gradle sync and download the necessary dependencies.</li>

<li>Connect your physical Android device via USB (or start an Emulator).</li>

<li>Press the green Run button in Android Studio.</li>
</ol>

### 📄 License
This project is open-source and available under the MIT License.

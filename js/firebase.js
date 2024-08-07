<script type="module">
  // Import the functions you need from the SDKs you need
  import { initializeApp } from "https://www.gstatic.com/firebasejs/10.12.5/firebase-app.js";
  import { getAnalytics } from "https://www.gstatic.com/firebasejs/10.12.5/firebase-analytics.js";
  // TODO: Add SDKs for Firebase products that you want to use
  // https://firebase.google.com/docs/web/setup#available-libraries

  // Your web app's Firebase configuration
  // For Firebase JS SDK v7.20.0 and later, measurementId is optional
  const firebaseConfig = {
    apiKey: "AIzaSyAp0faLmSCghnrvwJDNYg-RNakgCFmYfmo",
    authDomain: "kemel-online.firebaseapp.com",
    projectId: "kemel-online",
    storageBucket: "kemel-online.appspot.com",
    messagingSenderId: "474667463541",
    appId: "1:474667463541:web:7f7e1cdeaebacb7f29993c",
    measurementId: "G-0NWPR5WV2R"
  };

  // Initialize Firebase
  const app = initializeApp(firebaseConfig);
  const analytics = getAnalytics(app);
</script>
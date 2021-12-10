# Try Android

## Gradle

`gradle`은 빌드 엔진이다.

## Android Studio 세팅

### format on save

- edit -> Macros -> Start Macro Recording
- <kbd>shift</kbd> + <kbd>option</kbd> + <kbd>cmd</kbd> + <kbd>L</kbd> 으로 설정 확인
- 레코딩 시작
  - <kbd>option</kbd> + <kbd>cmd</kbd> + <kbd>L</kbd>
  - <kbd>cmd</kbd> + <kbd>S</kbd>
- edit -> Macros -> Stop Macro Recording ("format on save")
- preferences -> keymap -> "format on save" 를 <kbd>cmd</kbd> + <kbd>S</kbd> 로 지정

## Trouble Shooting

### xml에 정의된 id를 import할 수 없음

Android Studio 4.1 부터 Kotlin 코드로 ID를 바로 참조하는 기능이 기본적으로 disabled 되었으므로

=> gradle app plugins에 `id 'kotlin-android-extensions'` 추가

## Projects

### [TodoList](./TodoList)

> [Build A Simple Android App With Kotlin](https://youtu.be/BBWyXo-3JGQ)

![TodoList 화면](./docs/images/TodoList.jpg)

### []()

> [Kotlin & Android 12 Tutorial | Learn How to Build an Android App 📱 9+ h FREE Development Masterclass](https://youtu.be/HwoxgUPabMk)

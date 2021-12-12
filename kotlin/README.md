# Try Kotlin

## References

- [freeCodeCamp - Kotlin](https://youtu.be/F9UC9DY-vIU)
- [Kotlin & Android 12 Tutorial](https://youtu.be/HwoxgUPabMk)

## Basics

### Lambda Expression

- 이름이 없는 함수
- 람다 표현식과 익명함수는 function literals 이다. (정의되지 않았지만 즉시 실행가능한 표현식)
- `{ var -> /* body */ }` 로 정의되며 변수가 있다면 파라미터로 받는다.

```kotlin
// function
fun add (a: Int, b: Int) {
  val add = a + b
}

// lambda
val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
val sum = { a: Int, b: Int -> a + b }
```

### 접근 지정자

- `internal` modifier
  - Kotlin 기능이며 Java에는 없다
  - 구현된 module 내부에서만 보일 수 있도록 처리된다. (즉, 모듈 내부에서만 접근이 가능하다)
- `open`
  - Kotlin의 모든 클래스는 기본적으로 final이다. 그래서 기본적으로 상속이 불가하다. (Java는 그 반대)
  - 상속가능하게 만드려면 open을 지정하자

나머지는 다른 언어와 동일하다. (public, private, protected)

### Nested Class

- Nested Class는 기본적으로 `static`이다. 그래서 객체 생성없이 멤버 접근이 가능하다.
- Nested Class는 외부(Outer) 클래스에 접근 불가하다.

### Inner Class

- inner 키워드와 함께 만들어진 Nested Class
- interface 이거나, nested class가 아닌경우 불가핟.
- 일반 Nested Class 보다 이점은 outer class의 멤버 접근이 가능하다는 점이다 (private라도 가능)
- 위와 같은 이유로 outer 에 대한 레퍼런스를 유지한다. (특별한 설정없이 참조가 가능하다)

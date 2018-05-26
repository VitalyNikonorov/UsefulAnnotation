# UsefulAnnotation
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

UsefulAnnotation is a kit of useful annotations for your Java/Kotlin projects.

At first iteration it includes a couple of annotations for old legacy projects and helps developers to start refactoring codebase.

## Usage

Add lib module into your project or copy source files from `net.nikonorov.lib` package.

Just use it in your code for marking smells code fragments. Use `description` for explanation why this code has been marked.

```java
    @NeedRefactoring(description = "extract this code in model or in interactor (domain layer)")
    private void someBusinessLogic() {
        //some method with 1k lines of code with application business logic
    }
```

## License
```
MIT License

Copyright (c) 2017 Vitaly Nikonorov (@VitalyNikonorov)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

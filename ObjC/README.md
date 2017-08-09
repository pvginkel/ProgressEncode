# ProgressEncode Obj-C


### Usage

First you have to import the Progress class header

```objc
#import "Progress.h"
```

After that, just convert your NSString into a NSData using NSASCIIStringEncoding

```objc
[...]

NSString *test = @"1234567";
[Progress encode:[test dataUsingEncoding:NSASCIIStringEncoding]];

[...]
```

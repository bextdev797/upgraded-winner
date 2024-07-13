# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.bextdev797.TextView.TextView {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/bextdev797/TextView/repack'
-flattenpackagehierarchy
-dontpreverify

package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/ListDivider/listDividerClasses.ListDividerClasses> */
trait PartialListDividerClasses extends StObject {
  
  var insetGutter: js.UndefOr[String] = js.undefined
  
  var insetStartContent: js.UndefOr[String] = js.undefined
  
  var insetStartDecorator: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialListDividerClasses {
  
  inline def apply(): PartialListDividerClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListDividerClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialListDividerClasses] (val x: Self) extends AnyVal {
    
    inline def setInsetGutter(value: String): Self = StObject.set(x, "insetGutter", value.asInstanceOf[js.Any])
    
    inline def setInsetGutterUndefined: Self = StObject.set(x, "insetGutter", js.undefined)
    
    inline def setInsetStartContent(value: String): Self = StObject.set(x, "insetStartContent", value.asInstanceOf[js.Any])
    
    inline def setInsetStartContentUndefined: Self = StObject.set(x, "insetStartContent", js.undefined)
    
    inline def setInsetStartDecorator(value: String): Self = StObject.set(x, "insetStartDecorator", value.asInstanceOf[js.Any])
    
    inline def setInsetStartDecoratorUndefined: Self = StObject.set(x, "insetStartDecorator", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

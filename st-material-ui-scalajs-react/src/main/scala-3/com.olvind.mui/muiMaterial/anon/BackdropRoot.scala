package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackdropRoot extends StObject {
  
  var Backdrop: js.UndefOr[ElementType] = js.undefined
  
  var Root: js.UndefOr[ElementType] = js.undefined
}
object BackdropRoot {
  
  inline def apply(): BackdropRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackdropRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackdropRoot] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: ElementType): Self = StObject.set(x, "Backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "Backdrop", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}

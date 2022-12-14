package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackdropRoot extends StObject {
  
  var Backdrop: js.UndefOr[ReactElement] = js.undefined
  
  var Root: js.UndefOr[ReactElement] = js.undefined
}
object BackdropRoot {
  
  inline def apply(): BackdropRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackdropRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackdropRoot] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: ReactElement): Self = StObject.set(x, "Backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "Backdrop", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}

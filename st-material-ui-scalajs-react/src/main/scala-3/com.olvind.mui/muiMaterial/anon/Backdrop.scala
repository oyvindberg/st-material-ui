package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backdrop extends StObject {
  
  var Backdrop: js.UndefOr[ElementType] = js.undefined
  
  var Root: js.UndefOr[ElementType] = js.undefined
}
object Backdrop {
  
  inline def apply(): Backdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backdrop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backdrop] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: ElementType): Self = StObject.set(x, "Backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "Backdrop", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}

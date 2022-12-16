package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  var Badge: js.UndefOr[ElementType] = js.undefined
  
  var Root: js.UndefOr[ElementType] = js.undefined
}
object Badge {
  
  inline def apply(): Badge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: ElementType): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}

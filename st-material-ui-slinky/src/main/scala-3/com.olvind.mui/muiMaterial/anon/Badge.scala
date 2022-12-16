package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  var Badge: js.UndefOr[ReactElement] = js.undefined
  
  var Root: js.UndefOr[ReactElement] = js.undefined
}
object Badge {
  
  inline def apply(): Badge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: ReactElement): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}

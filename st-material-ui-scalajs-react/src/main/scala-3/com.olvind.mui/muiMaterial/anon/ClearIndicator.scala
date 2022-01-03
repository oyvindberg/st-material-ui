package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearIndicator extends StObject {
  
  var clearIndicator: js.UndefOr[PartialIconButtonPropsIconButtonTypeMapb] = js.undefined
}
object ClearIndicator {
  
  inline def apply(): ClearIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearIndicator]
  }
  
  extension [Self <: ClearIndicator](x: Self) {
    
    inline def setClearIndicator(value: PartialIconButtonPropsIconButtonTypeMapb): Self = StObject.set(x, "clearIndicator", value.asInstanceOf[js.Any])
    
    inline def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
  }
}

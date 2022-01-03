package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  var defaultProps: js.UndefOr[PartialOptions] = js.undefined
}
object `147` {
  
  inline def apply(): `147` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`147`]
  }
  
  extension [Self <: `147`](x: Self) {
    
    inline def setDefaultProps(value: PartialOptions): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
  }
}

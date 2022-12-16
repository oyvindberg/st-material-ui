package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  var defaultProps: js.UndefOr[PartialOptions] = js.undefined
}
object `152` {
  
  inline def apply(): `152` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`152`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `152`] (val x: Self) extends AnyVal {
    
    inline def setDefaultProps(value: PartialOptions): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
  }
}

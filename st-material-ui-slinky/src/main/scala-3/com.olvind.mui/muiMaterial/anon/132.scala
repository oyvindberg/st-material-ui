package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSwipeableDrawerProps] = js.undefined
}
object `132` {
  
  inline def apply(): `132` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`132`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `132`] (val x: Self) extends AnyVal {
    
    inline def setDefaultProps(value: PartialSwipeableDrawerProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
  }
}

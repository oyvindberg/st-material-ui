package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var defaultProps: js.UndefOr[PartialPopperPropsAbout] = js.undefined
}
object `111` {
  
  inline def apply(): `111` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `111`] (val x: Self) extends AnyVal {
    
    inline def setDefaultProps(value: PartialPopperPropsAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
  }
}

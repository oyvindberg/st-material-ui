package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.backdropBackdropMod.BackdropComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var root: js.UndefOr[HTMLAttributes[HTMLDivElement] & BackdropComponentsPropsOverrides] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: HTMLAttributes[HTMLDivElement] & BackdropComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

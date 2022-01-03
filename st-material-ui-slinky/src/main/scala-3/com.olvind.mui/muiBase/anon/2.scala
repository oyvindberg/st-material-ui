package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.formControlUnstyledPropsMod.FormControlUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var root: js.UndefOr[HTMLAttributes[HTMLDivElement] & FormControlUnstyledComponentsPropsOverrides] = js.undefined
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setRoot(value: HTMLAttributes[HTMLDivElement] & FormControlUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

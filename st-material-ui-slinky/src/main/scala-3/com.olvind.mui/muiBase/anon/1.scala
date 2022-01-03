package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.buttonUnstyledPropsMod.ButtonUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ButtonHTMLAttributes
import org.scalajs.dom.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var root: js.UndefOr[ButtonHTMLAttributes[HTMLButtonElement] & ButtonUnstyledComponentsPropsOverrides] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setRoot(value: ButtonHTMLAttributes[HTMLButtonElement] & ButtonUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

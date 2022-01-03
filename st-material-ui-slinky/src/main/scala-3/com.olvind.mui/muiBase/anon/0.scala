package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.backdropUnstyledBackdropUnstyledMod.BackdropUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var root: js.UndefOr[HTMLAttributes[HTMLDivElement] & BackdropUnstyledComponentsPropsOverrides] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setRoot(value: HTMLAttributes[HTMLDivElement] & BackdropUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

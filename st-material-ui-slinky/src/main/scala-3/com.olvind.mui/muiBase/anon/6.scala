package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.div
import com.olvind.mui.muiBase.tabUnstyledPropsMod.TabUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var root: js.UndefOr[ComponentPropsWithRef[div] & TabUnstyledComponentsPropsOverrides] = js.undefined
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setRoot(value: ComponentPropsWithRef[div] & TabUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

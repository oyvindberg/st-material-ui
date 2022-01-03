package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.div
import com.olvind.mui.muiBase.tabPanelUnstyledPropsMod.TabPanelUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var root: js.UndefOr[ComponentPropsWithRef[div] & TabPanelUnstyledComponentsPropsOverrides] = js.undefined
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setRoot(value: ComponentPropsWithRef[div] & TabPanelUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

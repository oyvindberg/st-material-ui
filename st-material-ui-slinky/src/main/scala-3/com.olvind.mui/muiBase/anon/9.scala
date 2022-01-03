package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.div
import com.olvind.mui.muiBase.tabsUnstyledPropsMod.TabsUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var root: js.UndefOr[ComponentPropsWithRef[div] & TabsUnstyledComponentsPropsOverrides] = js.undefined
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setRoot(value: ComponentPropsWithRef[div] & TabsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

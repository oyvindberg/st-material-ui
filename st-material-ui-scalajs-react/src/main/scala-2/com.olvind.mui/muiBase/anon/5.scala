package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.div
import com.olvind.mui.muiBase.tabPanelUnstyledPropsMod.TabPanelUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5` extends StObject {
  
  var root: js.UndefOr[ComponentPropsWithRef[div] with TabPanelUnstyledComponentsPropsOverrides] = js.native
}
object `5` {
  
  @scala.inline
  def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: ComponentPropsWithRef[div] with TabPanelUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.div
import com.olvind.mui.muiBase.tabsListUnstyledPropsMod.TabsListUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8` extends StObject {
  
  var root: js.UndefOr[ComponentPropsWithRef[div] with TabsListUnstyledComponentsPropsOverrides] = js.native
}
object `8` {
  
  @scala.inline
  def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: ComponentPropsWithRef[div] with TabsListUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

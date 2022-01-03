package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.button
import com.olvind.mui.muiBase.muiBaseStrings.div
import com.olvind.mui.muiBase.tablePaginationActionsUnstyledPropsMod.TablePaginationActionsUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstButton extends StObject {
  
  var backButton: js.UndefOr[
    ComponentPropsWithRef[button] with TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.native
  
  var firstButton: js.UndefOr[
    ComponentPropsWithRef[button] with TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.native
  
  var lastButton: js.UndefOr[
    ComponentPropsWithRef[button] with TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.native
  
  var nextButton: js.UndefOr[
    ComponentPropsWithRef[button] with TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.native
  
  var root: js.UndefOr[
    ComponentPropsWithRef[div] with TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.native
}
object FirstButton {
  
  @scala.inline
  def apply(): FirstButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstButton]
  }
  
  @scala.inline
  implicit class FirstButtonMutableBuilder[Self <: FirstButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackButton(value: ComponentPropsWithRef[button] with TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    @scala.inline
    def setFirstButton(value: ComponentPropsWithRef[button] with TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "firstButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstButtonUndefined: Self = StObject.set(x, "firstButton", js.undefined)
    
    @scala.inline
    def setLastButton(value: ComponentPropsWithRef[button] with TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "lastButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastButtonUndefined: Self = StObject.set(x, "lastButton", js.undefined)
    
    @scala.inline
    def setNextButton(value: ComponentPropsWithRef[button] with TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
    
    @scala.inline
    def setRoot(value: ComponentPropsWithRef[div] with TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

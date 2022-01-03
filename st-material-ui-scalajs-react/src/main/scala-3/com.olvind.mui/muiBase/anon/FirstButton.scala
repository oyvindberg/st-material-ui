package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.button
import com.olvind.mui.muiBase.muiBaseStrings.div
import com.olvind.mui.muiBase.tablePaginationActionsUnstyledPropsMod.TablePaginationActionsUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstButton extends StObject {
  
  var backButton: js.UndefOr[
    ComponentPropsWithRef[button] & TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.undefined
  
  var firstButton: js.UndefOr[
    ComponentPropsWithRef[button] & TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.undefined
  
  var lastButton: js.UndefOr[
    ComponentPropsWithRef[button] & TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.undefined
  
  var nextButton: js.UndefOr[
    ComponentPropsWithRef[button] & TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.undefined
  
  var root: js.UndefOr[
    ComponentPropsWithRef[div] & TablePaginationActionsUnstyledComponentsPropsOverrides
  ] = js.undefined
}
object FirstButton {
  
  inline def apply(): FirstButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstButton]
  }
  
  extension [Self <: FirstButton](x: Self) {
    
    inline def setBackButton(value: ComponentPropsWithRef[button] & TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    inline def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    inline def setFirstButton(value: ComponentPropsWithRef[button] & TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "firstButton", value.asInstanceOf[js.Any])
    
    inline def setFirstButtonUndefined: Self = StObject.set(x, "firstButton", js.undefined)
    
    inline def setLastButton(value: ComponentPropsWithRef[button] & TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "lastButton", value.asInstanceOf[js.Any])
    
    inline def setLastButtonUndefined: Self = StObject.set(x, "lastButton", js.undefined)
    
    inline def setNextButton(value: ComponentPropsWithRef[button] & TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
    
    inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
    
    inline def setRoot(value: ComponentPropsWithRef[div] & TablePaginationActionsUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

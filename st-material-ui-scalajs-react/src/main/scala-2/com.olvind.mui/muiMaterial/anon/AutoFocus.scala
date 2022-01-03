package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFocus extends StObject {
  
  /**
    * If `true`, the list item is focused during the first mount.
    * Focus will also be triggered if the value changes from false to true.
    * @default false
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialMenuItemClasses] = js.native
  
  /**
    * If `true`, compact vertical padding designed for keyboard and mouse input is used.
    * The prop defaults to the value inherited from the parent Menu component.
    * @default false
    */
  var dense: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the left and right padding is removed.
    * @default false
    */
  var disableGutters: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, a 1px light border is added to the bottom of the menu item.
    * @default false
    */
  var divider: js.UndefOr[Boolean] = js.native
  
  /**
    * Use to apply selected styling.
    * @default false
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
}
object AutoFocus {
  
  @scala.inline
  def apply(): AutoFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFocus]
  }
  
  @scala.inline
  implicit class AutoFocusMutableBuilder[Self <: AutoFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialMenuItemClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    @scala.inline
    def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
  }
}

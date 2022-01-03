package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.default
import com.olvind.mui.muiMaterial.muiMaterialStrings.error
import com.olvind.mui.muiMaterial.muiMaterialStrings.filled
import com.olvind.mui.muiMaterial.muiMaterialStrings.info
import com.olvind.mui.muiMaterial.muiMaterialStrings.medium
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.primary
import com.olvind.mui.muiMaterial.muiMaterialStrings.secondary
import com.olvind.mui.muiMaterial.muiMaterialStrings.small
import com.olvind.mui.muiMaterial.muiMaterialStrings.success
import com.olvind.mui.muiMaterial.muiMaterialStrings.warning
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.EventHandler
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clickable extends StObject {
  
  /**
    * The Avatar element to display.
    */
  var avatar: js.UndefOr[ReactElement] = js.native
  
  /**
    * This prop isn't supported.
    * Use the `component` prop if you need to change the children structure.
    */
  var children: js.UndefOr[Null] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialChipClasses] = js.native
  
  /**
    * If `true`, the chip will appear clickable, and will raise when pressed,
    * even if the onClick prop is not defined.
    * If `false`, the chip will not appear clickable, even if onClick prop is defined.
    * This can be used, for example,
    * along with the component prop to indicate an anchor Chip is clickable.
    * Note: this controls the UI and does not affect the onClick event.
    */
  var clickable: js.UndefOr[Boolean] = js.native
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'default'
    */
  var color: js.UndefOr[default | primary | secondary | error | info | success | warning] = js.native
  
  /**
    * Override the default delete icon element. Shown only if `onDelete` is set.
    */
  var deleteIcon: js.UndefOr[ReactElement] = js.native
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Icon element.
    */
  var icon: js.UndefOr[ReactElement] = js.native
  
  /**
    * The content of the component.
    */
  var label: js.UndefOr[ReactElement] = js.native
  
  /**
    * Callback fired when the delete icon is clicked.
    * If set, the delete icon will be shown.
    */
  var onDelete: js.UndefOr[EventHandler[Any]] = js.native
  
  /**
    * The size of the component.
    * @default 'medium'
    */
  var size: js.UndefOr[small | medium] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * The variant to use.
    * @default 'filled'
    */
  var variant: js.UndefOr[filled | outlined] = js.native
}
object Clickable {
  
  @scala.inline
  def apply(): Clickable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clickable]
  }
  
  @scala.inline
  implicit class ClickableMutableBuilder[Self <: Clickable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: ReactElement): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialChipClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setColor(value: default | primary | secondary | error | info | success | warning): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDeleteIcon(value: ReactElement): Self = StObject.set(x, "deleteIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteIconUndefined: Self = StObject.set(x, "deleteIcon", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOnDelete(value: Any => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
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
    
    @scala.inline
    def setVariant(value: filled | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}

package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.EventHandler
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clickable extends StObject {
  
  /**
    * The Avatar element to display.
    */
  var avatar: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * This prop isn't supported.
    * Use the `component` prop if you need to change the children structure.
    */
  var children: js.UndefOr[Null] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialChipClasses] = js.undefined
  
  /**
    * If `true`, the chip will appear clickable, and will raise when pressed,
    * even if the onClick prop is not defined.
    * If `false`, the chip will not appear clickable, even if onClick prop is defined.
    * This can be used, for example,
    * along with the component prop to indicate an anchor Chip is clickable.
    * Note: this controls the UI and does not affect the onClick event.
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color of the component.
    * It supports both default and custom theme colors, which can be added as shown in the
    * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
    * @default 'default'
    */
  var color: js.UndefOr["default" | "primary" | "secondary" | "error" | "info" | "success" | "warning"] = js.undefined
  
  /**
    * Override the default delete icon element. Shown only if `onDelete` is set.
    */
  var deleteIcon: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Icon element.
    */
  var icon: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The content of the component.
    */
  var label: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Callback fired when the delete icon is clicked.
    * If set, the delete icon will be shown.
    */
  var onDelete: js.UndefOr[EventHandler[Any]] = js.undefined
  
  /**
    * The size of the component.
    * @default 'medium'
    */
  var size: js.UndefOr["small" | "medium"] = js.undefined
  
  /**
    * If `true`, allows the disabled chip to escape focus.
    * If `false`, allows the disabled chip to receive focus.
    * @default false
    */
  var skipFocusWhenDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  
  /**
    *  @ignore
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The variant to use.
    * @default 'filled'
    */
  var variant: js.UndefOr["filled" | "outlined"] = js.undefined
}
object Clickable {
  
  inline def apply(): Clickable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clickable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clickable] (val x: Self) extends AnyVal {
    
    inline def setAvatar(value: ReactElement): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setClasses(value: PartialChipClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setColor(value: "default" | "primary" | "secondary" | "error" | "info" | "success" | "warning"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDeleteIcon(value: ReactElement): Self = StObject.set(x, "deleteIcon", value.asInstanceOf[js.Any])
    
    inline def setDeleteIconUndefined: Self = StObject.set(x, "deleteIcon", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnDelete(value: Any => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
    
    inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    inline def setSize(value: "small" | "medium"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkipFocusWhenDisabled(value: Boolean): Self = StObject.set(x, "skipFocusWhenDisabled", value.asInstanceOf[js.Any])
    
    inline def setSkipFocusWhenDisabledUndefined: Self = StObject.set(x, "skipFocusWhenDisabled", js.undefined)
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setVariant(value: "filled" | "outlined"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}

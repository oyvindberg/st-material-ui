package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisablePointerEvents extends StObject {
  
  /**
    * The content of the component, normally an `IconButton` or string.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialInputAdornmentClasses] = js.undefined
  
  /**
    * Disable pointer events on the root.
    * This allows for the content of the adornment to focus the `input` on click.
    * @default false
    */
  var disablePointerEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If children is a string then disable wrapping in a Typography component.
    * @default false
    */
  var disableTypography: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The position this adornment should appear relative to the `Input`.
    */
  var position: "start" | "end"
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  
  /**
    * The variant to use.
    * Note: If you are using the `TextField` component or the `FormControl` component
    * you do not have to set this manually.
    */
  var variant: js.UndefOr["standard" | "outlined" | "filled"] = js.undefined
}
object DisablePointerEvents {
  
  inline def apply(position: "start" | "end"): DisablePointerEvents = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisablePointerEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisablePointerEvents] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: PartialInputAdornmentClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDisablePointerEvents(value: Boolean): Self = StObject.set(x, "disablePointerEvents", value.asInstanceOf[js.Any])
    
    inline def setDisablePointerEventsUndefined: Self = StObject.set(x, "disablePointerEvents", js.undefined)
    
    inline def setDisableTypography(value: Boolean): Self = StObject.set(x, "disableTypography", value.asInstanceOf[js.Any])
    
    inline def setDisableTypographyUndefined: Self = StObject.set(x, "disableTypography", js.undefined)
    
    inline def setPosition(value: "start" | "end"): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setVariant(value: "standard" | "outlined" | "filled"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}

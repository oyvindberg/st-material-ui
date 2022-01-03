package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.end
import com.olvind.mui.muiMaterial.muiMaterialStrings.filled
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import com.olvind.mui.muiMaterial.muiMaterialStrings.start
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisablePointerEvents extends StObject {
  
  /**
    * The content of the component, normally an `IconButton` or string.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialInputAdornmentClasses] = js.native
  
  /**
    * Disable pointer events on the root.
    * This allows for the content of the adornment to focus the `input` on click.
    * @default false
    */
  var disablePointerEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * If children is a string then disable wrapping in a Typography component.
    * @default false
    */
  var disableTypography: js.UndefOr[Boolean] = js.native
  
  /**
    * The position this adornment should appear relative to the `Input`.
    */
  var position: start | end = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * The variant to use.
    * Note: If you are using the `TextField` component or the `FormControl` component
    * you do not have to set this manually.
    */
  var variant: js.UndefOr[standard | outlined | filled] = js.native
}
object DisablePointerEvents {
  
  @scala.inline
  def apply(position: start | end): DisablePointerEvents = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisablePointerEvents]
  }
  
  @scala.inline
  implicit class DisablePointerEventsMutableBuilder[Self <: DisablePointerEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: PartialInputAdornmentClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setDisablePointerEvents(value: Boolean): Self = StObject.set(x, "disablePointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePointerEventsUndefined: Self = StObject.set(x, "disablePointerEvents", js.undefined)
    
    @scala.inline
    def setDisableTypography(value: Boolean): Self = StObject.set(x, "disableTypography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTypographyUndefined: Self = StObject.set(x, "disableTypography", js.undefined)
    
    @scala.inline
    def setPosition(value: start | end): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
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
    def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}

package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackdropComponent extends StObject {
  
  /**
    * A backdrop component. This prop enables custom backdrop rendering.
    * @deprecated Use `slots.backdrop` instead. While this prop currently works, it will be removed in the next major version.
    * Use the `slots.backdrop` prop to make your application ready for the next version of Material UI.
    * @default styled(Backdrop, {
    *   name: 'MuiModal',
    *   slot: 'Backdrop',
    *   overridesResolver: (props, styles) => {
    *     return styles.backdrop;
    *   },
    * })({
    *   zIndex: -1,
    * })
    */
  var BackdropComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Props applied to the [`Backdrop`](/material-ui/api/backdrop/) element.
    * @deprecated Use `slotProps.backdrop` instead.
    */
  var BackdropProps: js.UndefOr[PartialBackdropPropsBackdropTypeMapdivde] = js.undefined
  
  /**
    * The components used for each slot inside.
    *
    * This prop is an alias for the `slots` prop.
    * It's recommended to use the `slots` prop instead.
    *
    * @default {}
    */
  var components: js.UndefOr[Backdrop] = js.undefined
  
  /**
    * The extra props for the slot components.
    * You can override the existing props or add new ones.
    *
    * This prop is an alias for the `slotProps` prop.
    * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
    *
    * @default {}
    */
  var componentsProps: js.UndefOr[com.olvind.mui.muiBase.anon.Backdrop] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
}
object BackdropComponent {
  
  inline def apply(): BackdropComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackdropComponent]
  }
  
  extension [Self <: BackdropComponent](x: Self) {
    
    inline def setBackdropComponent(value: ReactElement): Self = StObject.set(x, "BackdropComponent", value.asInstanceOf[js.Any])
    
    inline def setBackdropComponentUndefined: Self = StObject.set(x, "BackdropComponent", js.undefined)
    
    inline def setBackdropProps(value: PartialBackdropPropsBackdropTypeMapdivde): Self = StObject.set(x, "BackdropProps", value.asInstanceOf[js.Any])
    
    inline def setBackdropPropsUndefined: Self = StObject.set(x, "BackdropProps", js.undefined)
    
    inline def setComponents(value: Backdrop): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: com.olvind.mui.muiBase.anon.Backdrop): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
  }
}
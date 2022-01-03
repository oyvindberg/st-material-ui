package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sx extends StObject {
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @mui/material.anon.BackdropUnstyledTypeMapdivprops['classes'] */ js.Any
  ] = js.native
  
  /**
    * If `true`, the component is shown.
    */
  var open: Boolean = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  /**
    * The duration for the transition, in milliseconds.
    * You may specify a single timeout for all transitions, or individually with an object.
    */
  var transitionDuration: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @mui/material.@mui/material/transitions/transition.TransitionProps['timeout'] */ js.Any
  ] = js.native
}
object Sx {
  
  @scala.inline
  def apply(open: Boolean): Sx = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sx]
  }
  
  @scala.inline
  implicit class SxMutableBuilder[Self <: Sx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @mui/material.anon.BackdropUnstyledTypeMapdivprops['classes'] */ js.Any
    ): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
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
    def setTransitionDuration(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @mui/material.@mui/material/transitions/transition.TransitionProps['timeout'] */ js.Any
    ): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
  }
}

package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetColor extends StObject {
  
  /**
    * Resolve the `color` value for the component.
    * @param {ColorPaletteProp | 'inherit' | undefined} instanceColorProp The color defined on the instance.
    * @param {ColorPaletteProp | 'inherit' | undefined} defaultColorProp The default color to use when variant inversion is not enabled.
    */
  def getColor(): js.UndefOr[ColorPaletteProp | "context"] = js.native
  @JSName("getColor")
  @scala.annotation.targetName("getColor_inherit")
  def getColor(instanceColorProp: "inherit"): js.UndefOr[ColorPaletteProp | "context"] = js.native
  @JSName("getColor")
  @scala.annotation.targetName("getColor_inherit_inherit")
  def getColor(instanceColorProp: "inherit", defaultColorProp: "inherit"): js.UndefOr[ColorPaletteProp | "context"] = js.native
  @JSName("getColor")
  @scala.annotation.targetName("getColor_inherit")
  def getColor(instanceColorProp: "inherit" | ColorPaletteProp, defaultColorProp: "inherit" | ColorPaletteProp): js.UndefOr[ColorPaletteProp | "context"] = js.native
  def getColor(instanceColorProp: ColorPaletteProp): js.UndefOr[ColorPaletteProp | "context"] = js.native
  def getColor(instanceColorProp: ColorPaletteProp, defaultColorProp: ColorPaletteProp): js.UndefOr[ColorPaletteProp | "context"] = js.native
  @JSName("getColor")
  @scala.annotation.targetName("getColor_inherit")
  def getColor(instanceColorProp: Unit, defaultColorProp: "inherit"): js.UndefOr[ColorPaletteProp | "context"] = js.native
  def getColor(instanceColorProp: Unit, defaultColorProp: ColorPaletteProp): js.UndefOr[ColorPaletteProp | "context"] = js.native
}

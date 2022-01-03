package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.marked
    - `com.olvind.mui`.muiBase.muiBaseStrings.vertical
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
    - `com.olvind.mui`.muiBase.muiBaseStrings.dragging
    - `com.olvind.mui`.muiBase.muiBaseStrings.rail
    - `com.olvind.mui`.muiBase.muiBaseStrings.track
    - `com.olvind.mui`.muiBase.muiBaseStrings.trackFalse
    - `com.olvind.mui`.muiBase.muiBaseStrings.trackInverted
    - `com.olvind.mui`.muiBase.muiBaseStrings.thumb
    - `com.olvind.mui`.muiBase.muiBaseStrings.active
    - `com.olvind.mui`.muiBase.muiBaseStrings.focusVisible
    - `com.olvind.mui`.muiBase.muiBaseStrings.valueLabel
    - `com.olvind.mui`.muiBase.muiBaseStrings.valueLabelOpen
    - `com.olvind.mui`.muiBase.muiBaseStrings.valueLabelCircle
    - `com.olvind.mui`.muiBase.muiBaseStrings.valueLabelLabel
    - `com.olvind.mui`.muiBase.muiBaseStrings.mark
    - `com.olvind.mui`.muiBase.muiBaseStrings.markActive
    - `com.olvind.mui`.muiBase.muiBaseStrings.markLabel
    - `com.olvind.mui`.muiBase.muiBaseStrings.markLabelActive
  */
  trait SliderUnstyledClassKey extends StObject
  
  @js.native
  trait SliderUnstyledClasses extends StObject {
    
    /** State class applied to the thumb element if it's active. */
    var active: String = js.native
    
    /** State class applied to the root and thumb element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** State class applied to the root if a thumb is being dragged. */
    var dragging: String = js.native
    
    /** State class applied to the thumb element if keyboard focused. */
    var focusVisible: String = js.native
    
    /** Class name applied to the mark element. */
    var mark: String = js.native
    
    /** Class name applied to the mark element if active (depending on the value). */
    var markActive: String = js.native
    
    /** Class name applied to the mark label element. */
    var markLabel: String = js.native
    
    /** Class name applied to the mark label element if active (depending on the value). */
    var markLabelActive: String = js.native
    
    /** Class name applied to the root element if `marks` is provided with at least one label. */
    var marked: String = js.native
    
    /** Class name applied to the rail element. */
    var rail: String = js.native
    
    /** Class name applied to the root element. */
    var root: String = js.native
    
    /** Class name applied to the thumb element. */
    var thumb: String = js.native
    
    /** Class name applied to the track element. */
    var track: String = js.native
    
    /** Class name applied to the root element if `track={false}`. */
    var trackFalse: String = js.native
    
    /** Class name applied to the root element if `track="inverted"`. */
    var trackInverted: String = js.native
    
    /** Class name applied to the thumb label element. */
    var valueLabel: String = js.native
    
    /** Class name applied to the thumb label's circle element. */
    var valueLabelCircle: String = js.native
    
    /** Class name applied to the thumb label's label element. */
    var valueLabelLabel: String = js.native
    
    /** Class name applied to the thumb label element if it's open. */
    var valueLabelOpen: String = js.native
    
    /** Class name applied to the root element if `orientation="vertical"`. */
    var vertical: String = js.native
  }
  object SliderUnstyledClasses {
    
    @scala.inline
    def apply(
      active: String,
      disabled: String,
      dragging: String,
      focusVisible: String,
      mark: String,
      markActive: String,
      markLabel: String,
      markLabelActive: String,
      marked: String,
      rail: String,
      root: String,
      thumb: String,
      track: String,
      trackFalse: String,
      trackInverted: String,
      valueLabel: String,
      valueLabelCircle: String,
      valueLabelLabel: String,
      valueLabelOpen: String,
      vertical: String
    ): SliderUnstyledClasses = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], markActive = markActive.asInstanceOf[js.Any], markLabel = markLabel.asInstanceOf[js.Any], markLabelActive = markLabelActive.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], trackFalse = trackFalse.asInstanceOf[js.Any], trackInverted = trackInverted.asInstanceOf[js.Any], valueLabel = valueLabel.asInstanceOf[js.Any], valueLabelCircle = valueLabelCircle.asInstanceOf[js.Any], valueLabelLabel = valueLabelLabel.asInstanceOf[js.Any], valueLabelOpen = valueLabelOpen.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderUnstyledClasses]
    }
    
    @scala.inline
    implicit class SliderUnstyledClassesMutableBuilder[Self <: SliderUnstyledClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragging(value: String): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkActive(value: String): Self = StObject.set(x, "markActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkLabel(value: String): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkLabelActive(value: String): Self = StObject.set(x, "markLabelActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarked(value: String): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRail(value: String): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackFalse(value: String): Self = StObject.set(x, "trackFalse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackInverted(value: String): Self = StObject.set(x, "trackInverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLabel(value: String): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLabelCircle(value: String): Self = StObject.set(x, "valueLabelCircle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLabelLabel(value: String): Self = StObject.set(x, "valueLabelLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLabelOpen(value: String): Self = StObject.set(x, "valueLabelOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}

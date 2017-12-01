/*
 * Copyright (c) 2005-2017 Substance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.demo.substance.main.check;

import org.pushingpixels.demo.substance.main.check.svg.tango.accessories_text_editor;
import org.pushingpixels.demo.substance.main.check.svg.tango.computer;
import org.pushingpixels.demo.substance.main.check.svg.tango.dialog_error;
import org.pushingpixels.demo.substance.main.check.svg.tango.dialog_information;
import org.pushingpixels.demo.substance.main.check.svg.tango.dialog_warning;
import org.pushingpixels.demo.substance.main.check.svg.tango.drive_harddisk;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_copy;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_cut;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_delete;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_paste;
import org.pushingpixels.demo.substance.main.check.svg.tango.edit_select_all;
import org.pushingpixels.demo.substance.main.check.svg.tango.emblem_system;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_angel;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_glasses;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_grin;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_plain;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_sad;
import org.pushingpixels.demo.substance.main.check.svg.tango.face_smile;
import org.pushingpixels.demo.substance.main.check.svg.tango.folder;
import org.pushingpixels.demo.substance.main.check.svg.tango.folder_new;
import org.pushingpixels.demo.substance.main.check.svg.tango.format_justify_fill;
import org.pushingpixels.demo.substance.main.check.svg.tango.go_down;
import org.pushingpixels.demo.substance.main.check.svg.tango.go_next;
import org.pushingpixels.demo.substance.main.check.svg.tango.go_up;
import org.pushingpixels.demo.substance.main.check.svg.tango.help_browser;
import org.pushingpixels.demo.substance.main.check.svg.tango.list_add;
import org.pushingpixels.demo.substance.main.check.svg.tango.locked;
import org.pushingpixels.demo.substance.main.check.svg.tango.media_floppy;
import org.pushingpixels.demo.substance.main.check.svg.tango.system_search;
import org.pushingpixels.demo.substance.main.check.svg.tango.text_x_generic;
import org.pushingpixels.demo.substance.main.check.svg.tango.user_home;
import org.pushingpixels.demo.substance.main.check.svg.tango.view_fullscreen;
import org.pushingpixels.demo.substance.main.check.svg.tango.view_refresh;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIcon;
import org.pushingpixels.substance.api.icon.SubstanceIconPack;

public class TangoIconPack implements SubstanceIconPack {

    @Override
    public SubstanceIcon getOptionPaneInformationIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_information.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getOptionPaneWarningIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_warning.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getOptionPaneErrorIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_error.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getOptionPaneQuestionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return help_browser.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserNewFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return folder_new.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserUpFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return go_up.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserHomeFolderIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return user_home.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserListViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return format_justify_fill.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserDetailsViewIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return accessories_text_editor.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserViewMenuIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return emblem_system.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserComputerIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return computer.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserDirectoryIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return folder.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserFileIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return text_x_generic.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserFloppyDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return media_floppy.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getFileChooserHardDriveIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return drive_harddisk.of(preferredSize, preferredSize);
    }

    @Override
    public SubstanceIcon getLockIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return locked.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getInspectIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return system_search.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getRefreshIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return view_refresh.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return list_add.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getNotAllowedIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return dialog_error.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getTextCopyActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_copy.of(preferredSize, preferredSize).colorize(preferredIconColorScheme);
    }
    
    @Override
    public SubstanceIcon getTextCutActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_cut.of(preferredSize, preferredSize).colorize(preferredIconColorScheme);
    }
    
    @Override
    public SubstanceIcon getTextPasteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_paste.of(preferredSize, preferredSize).colorize(preferredIconColorScheme);
    }
    
    @Override
    public SubstanceIcon getTextDeleteActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_delete.of(preferredSize, preferredSize).colorize(preferredIconColorScheme);
    }
    
    @Override
    public SubstanceIcon getTextSelectAllActionIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return edit_select_all.of(preferredSize, preferredSize).colorize(preferredIconColorScheme);
    }
    
    @Override
    public SubstanceIcon getColorChooserColorPalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_angel.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getColorChooserColorSlidersIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_glasses.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getColorChooserColorSwatchesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_grin.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getColorChooserColorWheelIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_plain.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getColorChooserCrayonsIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_sad.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getColorChooserImagePalettesIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return face_smile.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getScrollHorizontalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return go_next.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getScrollVerticalIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return go_down.of(preferredSize, preferredSize);
    }
    
    @Override
    public SubstanceIcon getScrollAllIcon(int preferredSize,
            SubstanceColorScheme preferredIconColorScheme) {
        return view_fullscreen.of(preferredSize, preferredSize);
    }
}
